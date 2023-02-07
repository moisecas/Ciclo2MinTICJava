let animales = [
    "aguila",
    "aguila pescadora",
    "salmon",

]
let clave = animal => animal==="salmon"; 
if(
    animales.some(clave)
){
    console.log("si hay salmon");   
}else{
    console.log("no hay salmon");
}


var a = ["a", "b", "c"];
a[100] = "z";
console.log(a.length); // 101

let rainForest = ["tiger", "elephant", "monkey", "snake", "frog"];
rainForest.splice(0,2);
console.log(rainForest); // ["monkey", "snake", "frog"]


const x =[1,2]
const y = [5,7]
const z=[...x,...y]
console.log(z) // [1,2,5,7]

let scores =[]
scores.push(1,2)
scores.pop()
scores.push(3,4)
scores.pop()
score = scores.reduce((a,b)=>a+b) 
console.log(score) // 3 

let animals = ["kangaroo", "bear", "coyote"]
if (animals.map(key).join("")==="key"){
    console.log("key")
}

function sum(num1, num2=2, num3=3){
    return num1+num2+num3
}
let values = [1,5]
let total = sum(4,...values) 

const arr1 = [1,2,3]
const arr2 = [4,5,6]
console.log([...arr1,...arr2]) // [1,2,3,4,5,6]