McKinseyCo
==========

Developer Intern Exercise
Code Challenge

TASK: Create an app that will be executed in terminal or from the command line. The app should accept a hashtag as an argument and should only print out unique urls found in the 100 most recent tweets that matched the hashtag.
  - I have uploaded Tweetin.java to solve this problem.
  - My program takes in a word as a command argument, and from that word (which is read as a hashtag for twitter) it searches through the most recent 100 tweets, finds the ones that have display URLs as part of the tweet, and prints out those URLS by using basic substrings to find portion of the file that contains the display URL and printing out the URL that follows.
  - I have included the file sample output for tweetin, which shows what happened when I compiled and ran my code with the hashtag hat as my command line argument. 

TASK: Given an array of integers, write some code to find all the integers that appear more than once in the array, sorted by which appears most often to least often (once)
  - I have uploaded intRepeats.java to solve this problem.
  - My program takes the array of random, unsorted integers I provided, and uses two ArrayLists I created, freq and number, to sort the array in order of frequency. I first sort the array from lowest to highest, and then proceed to run through the sorted array, counting the duplicates in a row and adding the number of duplicates to ArrayList freq, and the number whose duplicates are being counted to ArrayList number. I then sort the ArrayLists by frequency by sorting freq, and as freq is changing, also changing the corresponding values in number. I then simply print out ArrayList number for each of the frequencies using a nested for loop. 
  - I have included the file, sample output for intRepeats, which shows what happened when I compiled and ran my code.

