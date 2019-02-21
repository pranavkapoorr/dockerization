const app = require('express')();
const port = 5000;

app.get('/', (req, res) => {
    res.send('Hello Node I am Dockerized!');
  });

app.listen(port, () => {console.log('Server started and listening on ' + port)});