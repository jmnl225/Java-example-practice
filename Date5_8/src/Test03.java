import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Test03 {
	public static void main(String[] args) {
		
		
		try
		(ServerSocket server= new ServerSocket(8080)){
			System.out.println("서버가 시작되었습니다.");
			
			while(true) {
				
				Socket client= server.accept();
				
				Thread thread= new Thread() {
					public void run() {
						try(OutputStream out= client.getOutputStream();
							InputStream in = client.getInputStream()){
							
							out.write("HTTP/1.0 20 OK\n".getBytes());
							out.write("Content-Type: text/html\n\n".getBytes());
							for (int i=0; i<5; i++) {
								out.write("<h1>Have a lovely day!</h1>".getBytes());
								Thread.sleep(1000);
							}
						}catch (Exception e) {
							e.printStackTrace();
						}finally {
							try {
								client.close();
							}catch(Exception e) {}
							
						}
					}
				};
				
				thread.start();
				
				}
			}catch (Exception e) {
				e.printStackTrace();
		}
		
	} // method end.

}// main end.
