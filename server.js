const fs = require('fs');
const https = require('https');
const express = require('express');
var privateKey = fs.readFileSync( 'myserver.local.key' );
var certificate = fs.readFileSync( 'myserver.local.crt' );
var app = express();
var port = 3000;


export function helloWorld(){
    return "hello world";
}

export function helloWorld2(){
    return "hello world";
}


https.createServer({
    key: privateKey,
    cert: certificate
}, app).listen(port);



