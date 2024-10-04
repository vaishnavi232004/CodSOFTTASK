import java.util.Scanner;
public class ChatBot 
{
public static void main(String[] args) 
{
Scanner scanner=new Scanner(System.in);
System.out.println("Hello! I'm a simple chatbot. How can I assist you today?");
while(true) 
{
System.out.print("You: ");
String userInput=scanner.nextLine().toLowerCase();
if(userInput.contains("hello")||userInput.contains("hi")) 
{
System.out.println("Chatbot: Hello! How can I help you today?");
}
else if(userInput.contains("your name")) 
{
System.out.println("Chatbot: I'm a simple chatbot built in Java!");
}
else if(userInput.contains("time")) 
{
System.out.println("Chatbot: I'm not equipped to tell the time, but you can check your device!");
}
else if(userInput.contains("weather")) 
{
System.out.println("Chatbot: I don't have real-time weather updates, but you can check online!");
}
else if(userInput.contains("creator")||userInput.contains("who made you")) 
{
System.out.println("Chatbot: I was created by a developer learning Java!");
} 
else if(userInput.contains("java")) 
{
System.out.println("Chatbot: Java is a versatile and widely-used programming language.");
}
else if(userInput.contains("age")) 
{
System.out.println("Chatbot: I'm as old as the code running me!");
}
else if(userInput.contains("help")) 
{
System.out.println("Chatbot: I'm here to answer simple questions. Feel free to ask!");
} 
else if(userInput.contains("bye")) 
{
System.out.println("Chatbot: Goodbye! Have a great day!");
break;
}
else if(userInput.contains("hobby")) 
{
System.out.println("Chatbot: My hobby is responding to questions and helping people!");
} 
else 
{
System.out.println("Chatbot: I'm not sure about that. Can you ask something else?");
}
}
scanner.close();
}
}
