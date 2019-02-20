#linux image to use
FROM alpine

#set working directory
WORKDIR /app

#copy current directory content
COPY . /app

#install openjdk8
RUN apk add openjdk8

#setting env variables
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV PATH $PATH:$JAVA_HOME/bin

#compile the class
RUN javac HelloWorld.java

#running compiled java class
CMD java HelloWorld