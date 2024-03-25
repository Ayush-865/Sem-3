const readline = require("readline");
const r1 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

r1.question("Enter number between 0 and 10", (input) => {
    if (Number(input) > 0 && Number(input) < 10) {
        let num = Math.floor(Math.random() * (2 - 0) + 0);
        if (num == Number(input)) {
            console.log("good")
        } else {
            console.log(false)
        }
    }
    else {
        console.log(`You entered wrong input`);
    }
    r1.close()
})