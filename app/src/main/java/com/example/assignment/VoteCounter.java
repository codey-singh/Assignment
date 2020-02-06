package com.example.assignment;

import java.util.ArrayList;

public class VoteCounter {


    private static ArrayList<String> voters = new ArrayList<>();

    private static int votesForCandidate1 = 0;
    private static int votesForCandidate2 = 0;
    private static int votesForCandidate3 = 0;


    public static boolean checkIfRegistered(String combination) {
        if(voters.contains(combination.toLowerCase())){
            return true;
        } else {
            voters.add(combination.toLowerCase());
            return false;
        }
    }

    public static int getVotesForCandidate(int id){
        switch (id){
            case 1:
                return votesForCandidate1;
            case 2:
                return votesForCandidate2;
            case 3:
                return votesForCandidate3;
            default:
                return 0;
        }
    }

    public static void setVotesForCandidate(int id){
        switch (id){
            case 1:
                votesForCandidate1++;
                break;
            case 2:
                votesForCandidate2++;
                break;
            case 3:
                votesForCandidate3++;
                break;
            default:
                break;
        }

    }

}
