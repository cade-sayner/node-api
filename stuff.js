function createArray(a, b){
    return Array.from(Array(b-a).keys()).map(num => num + a);
}

let even_odd_struct = {}
function odd_even(a, b, n){
    return createArray(a, b+1).reduce((prev, cur)=>{prev[cur%n]+=cur; return prev}, Array.from(Array(n).keys()).map(()=>0)).reduce((prev, count, index)=>{prev[`${index} mod ${n}`]=count ; return prev}, {})
}

console.log(odd_even(10,20,3));






