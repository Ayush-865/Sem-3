const http = require('http');

const options = {
    hostname: 'api.coindesk.com',
    path: '/v1/bpi/currentprice.json',
    method: 'GET',
    port: 80,
};

const req = http.request(options, (res) => {
    let data = '';
    res.on('data', (chunk) => {
        data += chunk;
    });
    res.on('end', () => {
        console.log(data);
    });
});

req.on('error', (e) => {
    console.error(`Problem with request: ${e.message}`);
});

req.end();
