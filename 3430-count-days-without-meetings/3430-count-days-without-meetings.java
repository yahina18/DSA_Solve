class Solution {
    public int countDays(int days, int[][] meetings) {
        
         Arrays.sort(meetings, (a,b)-> Integer.compare(a[0],b[0]));

        int freedays = 0;
        int lastEndDay = 0;

        for(int[]meeting : meetings)
        {
            int start = meeting[0];
            int end = meeting[1];

            if(start > lastEndDay+1)
               freedays += (start - lastEndDay - 1);

            lastEndDay = Math.max(lastEndDay,end);   
        }

        if(lastEndDay < days)
           freedays += (days - lastEndDay);

        return freedays;   
        
    }
}