const readline=require("readline");

const r1= readline.Interface({
    input: process.stdin,
    output: process.stdout
})

const toFar=(input)=>{
    return 9*(input)/5 + 32;
}

r1.question("Enter degree no",(input)=>{
    let deg = parseInt(input);
    console.log(toFar(deg));
    r1.close();
})