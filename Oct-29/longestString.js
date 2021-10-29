function threeLongestWords(str){
    var strSplit = str.split();

    var longestWord1 = 0;
    var longestWord2 = 0;
    var longestWord3 = 0;

    for( var i =0; i < strSplit.length; i++){
        if(strSplit[1] > longestWord1){
            longestWord1 = '#' + strSplit[i];
        }else if(strSplit[1] > longestWord2){
            longestWord2 = '#' + strSplit[i];
        }else if(strSplit[1] > longestWord3){
            longestWord3 = '#' + strSplit[i];
        }
    }

    return longestWord1, longestWord2, longestWord3;
}