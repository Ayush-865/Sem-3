const fs = require('fs'); fs.writeFile('output.txt', 'Hello, Node.js!', (err) => {
    if (err) {
        console.error(err);
        return;
    } console.log('File written successfully!');
});