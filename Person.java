public class Person {
//personal information
    private String name;
    private int age;
    private String eyeColor;
//getters and setters
    public String getName(){
        return name;
    }
    public void setName(String)
    public int getAge(){
        return age;
    }
    public void setAge(int)
    public String getEyeColor(){
        return eyeColor;
    }
    public void setEyeColor(String)
//output
    public void welcomeMessage(){
        System.out.println("Welcome, coders! I am " + name + ".");
    }

    public String toString(){
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Eye Color: " + eyeColor + "\n"
    }

}
