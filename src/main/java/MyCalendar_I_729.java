class MyCalendar {
    private ArrayList<int[]> list;
    public MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int startTime, int endTime) {
        for( int[] arr :list){
            int start = arr[0];
            int end = arr[1];
            if(startTime < end && endTime>start){
                return false;
            }
        }
        list.add(new int[]{startTime,endTime});
        return true;
    }
}
