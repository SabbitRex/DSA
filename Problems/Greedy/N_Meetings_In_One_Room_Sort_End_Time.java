# https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1#

class N_Meetings_In_One_Room_Sort_End_Time {

    static class Meeting {
        
        int start;
        int end;
        
        public Meeting(int start, int end) {
            
            this.start = start;
            this.end = end;
        }    
    }
    
    public static int maxMeetings(int start[], int end[], int n) {
        
        List<Meeting> meetings = new ArrayList<>();
        
        for (int i=0; i<start.length; i++) {
            
            meetings.add(new Meeting(start[i], end[i]));
        }
        
        meetings.sort((m1, m2) -> m1.end - m2.end);
        
        int currentMeetingEndTime = meetings.get(0).end;
        
        int result = 1;
        
        for (int i=1; i<meetings.size(); i++) {
            
            if (meetings.get(i).start > currentMeetingEndTime) {
                
                currentMeetingEndTime = meetings.get(i).end;
                result++;
            }
        }
        
        return result;
    }
}
