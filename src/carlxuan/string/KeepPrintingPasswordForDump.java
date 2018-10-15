package carlxuan.string;

public class KeepPrintingPasswordForDump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread1().start();
		new Thread1().start();
	}
	
	
	static class Thread1 extends Thread
	{
		public void run()
		{
			while(true)
			{
				String password = "ThisIsMyPassword";
				if("Thisi".equals(password))
				{
					System.out.println("Correct");
				}else
				{
					System.out.println("Keep trying");
				}
			}
		}
	}

}
