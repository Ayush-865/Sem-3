const readline = require('readline');

const r1=readline.Interface({
    input:process.stdin,
    output: process.stdout
})

const isMultipleof3or7 = (num) => {
  if (num <= 0) {
    return false;
  }
  if (num % 3 == 0 || num % 7 == 0) {
    return true;
  } else {
    return false;
  }
}

rl.question('Enter positive number: ', (input) => {
  let num = parseInt(input);

  if (!isNaN(num)) {
    if (isMultipleof3or7(num)) {
      console.log(`${num} is divisible by 3 or 7`);
    } else {
      console.log(`${num} is not divisible by 3 or 7`);
    }
  } else {
    console.log("Enter a valid number");
  }

  rl.close();
});

r1.question("Enter pos nu",(input)=>{
    
})