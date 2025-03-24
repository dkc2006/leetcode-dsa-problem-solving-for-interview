class Solution {
    public int countDays(int days, int[][] meetings) {
        // Time Complexity: O(nlogn) and Space Complexity: O(1) (can be O(n) based on which sorting algo is used)
        Arrays.sort(meetings, Comparator.comparingInt(meeting -> meeting[0]));
        int end = meetings[0][1];
        int noMeetingDays = meetings[0][0] - 1;
        for (int i = 1; i < meetings.length; i++) {
            if (end < meetings[i][0]) {
                noMeetingDays += meetings[i][0] - end - 1;
            }
            end = Math.max(end, meetings[i][1]);
        }
        return noMeetingDays + (days - end);
    }
}
