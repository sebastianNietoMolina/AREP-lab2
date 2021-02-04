var app = ( function (){


    var mean;
    var std;
    var list;

    function getMeanStd(){
        list = $("#numbers").val();
        appClient.getMean(list, _setMean);
        appClient.getStd(list, _setStd);
        $("#Mean").text("Mean: " + mean);
        $("#StandardDeviation").text("Standard Deviation: " + std);
    }

    function _setMean(data){
        mean = data;
    }

    function _setStd(data){
        std = data;
    }


    return{
        getMeanStd: getMeanStd
    }
})();