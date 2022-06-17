function solution (arr1, arr2) {
    let answer=[];
    let sum =[];
    for (let i=0; i<arr1.length; i++){
        for (let j=0; j<arr1.length; j++) {
                sum.push(arr1[i][j]+arr2[i][j])
            
        }
        answer.push(sum);
        let sum =[];
    } return answer;
    }
    let arr1 = [[1,2],[2,3]];
    let arr2 = [[3,4],[5,6]];
    document.write(solution(arr1, arr2 ));

// let arr1 = [[1,2][2,3]]
// let arr2 = [[3,4][5,6]] 
// sum[0][0]+=(arr1[0][0]+arr2[0][0])
// sum[0][1]+=(arr1[0][1]+arr2[0][1])
// sum[1][0]+=(arr1[1][0]+arr2[1][0])
// sum[1][1]+=(arr1[1][1]+arr2[1][1])

// return answer=sum;