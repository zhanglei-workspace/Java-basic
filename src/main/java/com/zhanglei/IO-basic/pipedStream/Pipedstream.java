package pipedStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;


public class Pipedstream
{

	/**
	 * �ܵ���
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException
	{
		PipedInputStream input = new PipedInputStream();
		PipedOutputStream output = new PipedOutputStream();
		
		input.connect(output);
		
		new Thread(new Input(input)).start();
		new Thread(new Output(output)).start();
	}

	

}
