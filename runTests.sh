echo "\n******** Fresh MAKE ********"
make && make jar
echo "\n******** TASK 1 ********"
java -jar MarsBase.jar 1 < input1.txt
echo "\n******** TASK 3b ********"
java -jar MarsBase.jar 3b < input1.txt
echo "\n******** TASK 4 ********"
java -jar MarsBase.jar 4 < input2.txt
echo "\n******** TASK 5 ********"
java -jar MarsBase.jar 5 < input2.txt
echo "\n******** TASK 6 ********"
java -jar MarsBase.jar 6 < input2.txt
echo "\n******** Test Ends ********"