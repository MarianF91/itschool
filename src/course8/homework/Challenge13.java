package course8.homework;

public class Challenge13 {

    static String stringWithComments = "This is a string with //comments /*and more" +
            " comments*/.";

    public static void main(String[] args) {

        System.out.println("String with comments> " + stringWithComments);
        System.out.println("String without comments: " + noComments());
    }

    public static String noComments(){

        StringBuilder noComments = new StringBuilder();
        String[] lines = stringWithComments.split("\n"); //splits the string in to lines;

        for (String line : lines){ //checks each line in the "lines" array for comments;

            int singleLineComments = line.indexOf("//"); //checks to see where the comment starts;
            if (singleLineComments != -1){ //returns -1 if it doesn't find any comments;
                line = line.substring(0,singleLineComments); //eliminates the comment using substring and keeps everything on the left side of the comment;
            }

            while (line.contains("/*")){ //checks for multi-line comments;

                int startComment = line.indexOf("/*"); //checks for the beginning of the comment;
                int endComment = line.indexOf("*/",startComment); //checks for the end of the comment;

                if (endComment != -1){ //returns -1 if it doesn't find any comments;
                    line = line.substring(0,startComment) + line.substring(endComment + 2); //erases the comments and keeps everything on their left;
                } else {
                    line =line.substring(0,startComment); //if the result was -1, the process is stopped and it keeps only what's on the left of the marker;
                    break;
                }
            }
            noComments.append(line.trim()).append("\n"); //removes any blank spaces and places end of line;
        }
        return noComments.toString(); //saves the result to noComments to be returned to the main method.
    }
}