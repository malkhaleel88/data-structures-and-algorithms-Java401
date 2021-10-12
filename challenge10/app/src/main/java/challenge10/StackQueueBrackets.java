package challenge10;

import challenge10.stack.structure.Stack;

public class StackQueueBrackets {

    /**
     *  Code Challenge 13
     */

    public boolean validateBrackets(String bracket){

        Stack stack = new Stack();

        for (int i = 0; i < bracket.length(); i++) {
            char item = bracket.charAt(i);
            if(item == '{' || item == '(' || item == '['){
                stack.push(item + "");
            } else if(item == '}' || item == ')' || item == ']'){
                String value = stack.peek();
                if(((item+"").equals('}' + "") && value.equals( '{' + "" )
                        || (item+"").equals(')' + "") && value.equals( '(' + "" )
                        || (item+"").equals(']' + "") && value.equals( '[' + "" ))
                        && !stack.isEmpty()){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}