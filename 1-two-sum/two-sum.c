/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int a,b;
    for(int i=0;i<numsSize;i++){
        for(int j=i+1;j<numsSize;j++){
            if(nums[i]+nums[j]==target){
                a=i;
                b=j;
                break;
            }
             
        }
    }
    *returnSize=2;
    int * re =((int*)malloc((*returnSize) * sizeof(int)));
    re[0]=a;
    re[1]=b;
    return re;
}