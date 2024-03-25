const fs = require('fs');
fs.access('check.txt', fs.constants.F_OK, (err) => {
    if (err) {
        console.error(err); return;
    } console.log('File exists!');
});