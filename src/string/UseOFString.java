package string;

public class UseOFString {
	public static void main(String []args){
String st = "I am a java programmer";
		
		System.out.println(st.toUpperCase()); //displays capital letters
		System.out.println(st.toLowerCase());  //displays lowercase letters
        System.out.println(st.indexOf('j'));  //finding the place of j
        System.out.println(st.length());      //finding the length of letters
        System.out.println(st.substring(6)); // position of letter
        System.out.println(st.equals(args)); // verifying variable is the same 
        System.out.println(st.equals(st));    //verifying variable is the same 
        System.out.println(st.charAt(5));     //displays character at the position
        System.out.println(st.concat(" since 4 years"));  // add the string value
        System.out.println(st.indexOf("java"));  //displays the position of the String word which is "java" here.
        System.out.println(st.isEmpty());      //verify the st String is empty or not.
        System.out.println(st.replace("j","J"));  //replace the old character with the new character.
        System.out.println(st.replaceAll(st, " I am not a java programmer")); //replaces the whole sentence
        System.out.println(st.getBytes());  //Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
		
	}

}
