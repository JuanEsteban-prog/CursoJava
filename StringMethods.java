public class StringMethods {
    public static void main(String[] args) {
        String name = "    Juan Esteban";

        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(3);
        // Returns a character at a given index.
        System.out.println(letter);

        int index = name.indexOf("a");
        System.out.println(index);

        int lastIndex = name.lastIndexOf("a");
        System.out.println(lastIndex);

        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        name = name.trim();
        // Eliminates all the white spaces.
        System.out.println(name);

        // name = name.replace("a", "u");
        // System.out.println(name);

        System.out.println(name.isEmpty());
        if (name.isEmpty()) {
            System.out.println("Your name is empty");
        } else {
            System.out.println("Hello " + name);
        }

        if (name.contains(" ")) {
            System.out.println("Your name contain spaces");
        } else {
            System.out.println("Your name doesn't contain any spaces");
        }

        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
        } else {
            System.out.println("Hello " + name);
        }
    }
}
