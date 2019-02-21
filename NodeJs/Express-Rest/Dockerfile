#node v8
FROM node:8

#setting up working directory
WORKDIR /app
COPY . /app

#installing dependencies from package-json
RUN npm install

#exposing port
EXPOSE 5000

#starting server
CMD [ "npm", "start" ]