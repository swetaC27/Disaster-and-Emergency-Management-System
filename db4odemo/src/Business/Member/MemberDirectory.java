/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Member;

import java.util.ArrayList;

/**
 *
 * @author Sweta Chowdhury
 */
public class MemberDirectory {
    private ArrayList<Member> memberList;
    
    public MemberDirectory() {
        memberList = new ArrayList<Member>();
    }

    public ArrayList<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(ArrayList<Member> memberList) {
        this.memberList = memberList;
    }
    
    public Member addMember() {
        Member member = new Member();
        this.memberList.add(member);
        return member;
    }

    
    
    
    
}
