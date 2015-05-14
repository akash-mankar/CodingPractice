/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp, p1, p2, p3;
        p1 = head;
        p2 = head;
        
        while(n != 0){
            p2 = p2->next;
            n--;
        }
        // If n wants to remove head
        if(p2->next == NULL){
            // We want to remove head
            temp =  p1;
            p1 = p1->next;
            delete temp;
            head = p1;
            return head;
        }
        
        // Else we want to delete other nodes.
        while(p2->next != NULL){
            p1 = p1->next;
            p2 = p2->next;
        }
        
        // Now p1 is pointing to a node just before the node that needs to be deleted.
        // 1->2->3->4->5 with n = 2, p1 is now pointing to node 3.
        p3 = p1;
        p3 = p3->next;
        p3 = p3->next;
        
        temp = p1->next;
        p1->next = p3;
        delete temp;
        
        return head;
    }
};