package returntype;
public class P4 {
public static void main(String[] args) {
	int class_12 = ram();
	int class_9 = shayam();
	int class_11 = sita();
	int gap = (class_9 - class_12);
	int sum = (gap + class_11);
	System.out.println(gap + " " + sum);
}
public static int ram()
{
	int age = 37;
	return age;
}
public static int shayam()
{
	int age = 48;
	return age;
}
public static int sita()
{
	int age = 16;
	return age;
}
}
