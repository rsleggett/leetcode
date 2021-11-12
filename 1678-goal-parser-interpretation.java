class Solution {
    public String interpret(String command) {
         StringBuilder sb = new StringBuilder();
        for(int i = 0; i < command.length();)
        {
            char curr = command.charAt(i);
            if (curr == 'G')
            {
                sb.append(curr);
                i++;
            }
            else if(i + 1 < command.length() && command.charAt(i+1) == ')')
            {
                sb.append("o");
                i+=2;
            }
            else
            {
                sb.append("al");
                i+=4;
            }
        }
        return sb.toString();       
    }
}
