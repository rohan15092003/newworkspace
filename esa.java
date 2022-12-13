// import java.io.*;
// class Test{
// 	public static void main(String[] args) throws Exception {
	
// 	FileOutputStream fos=new FileOutputStream("obj.ob");
// 	ObjectOutputStream oos=new ObjectOutputStream(fos);
// 	Sample s=new Sample();
// 	oos.writeObject(s);
// 	oos.close();	
// 	}
// }
// class Sample implements Serializable{
// 	int a=10;
// 	String s="abc xyz";
// }
import java.io.*;
class Test{
	public static void main(String[] args) throws Exception {
	
	FileInputStream fos=new FileInputStream("obj.ob");
	ObjectInputStream oos=new ObjectInputStream(fos);
	Sample s=(Sample) oos.readObject();
	System.out.println(s.a);
	System.out.println(s.s);
	
	oos.close();
	}
}
class Sample implements Serializable{
	int a=10;
	String s="abc xyz";
}
/*import java.io.*;
class Test{
	public static void main(String[] args) throws Exception {
		File f=new File("images.jpg");
		FileInputStream fis=new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream("a.jpg");
		byte r[]=new byte[(int)f.length()];

		fis.read(r);
		fos.write(r);
		fos.close();	
	}
}*/
