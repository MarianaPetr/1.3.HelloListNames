/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class HelloNamelist {
    public String getGreeting(String[] nameList) {
    	String str="Hello ";
    	for (int i=0; i< nameList.length; i++)
		{
    		str+=nameList[i].toString();
		}
    	return str;
    }

    public static void main(String[] args) {
        System.out.println(new HelloNamelist().getGreeting(new String[] {"QA", "Automation", "Test"}));
    }
}
