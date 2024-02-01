function confirm(){
    if (window.confirm("Do you sure to submit it your form.")==1){
        document.bmi.submit();
    }
}

function cancel(){
    if (window.confirm("Do you sure to reset it your form.")==1){
        document.bmi.reset();
    }
}
function combine(){
    var weight = document.getElementById('Weight').value
    var height = document.getElementById('Height').value
    var sum = weight*height
    return sum
}

function calculate(){
    var weight = document.getElementById('Weight').value
    var height = document.getElementById('Height').value
    var sum = weight*height
    //document.getElementById("result").innerHTML = sum
    if((document.getElementById("results").innerHTML = sum)==1){
        document.bmi.reset()

    }
}

//document.title = "A new title";
//document.getElementById("demo").innerHTML = document.title;
//document.getElementsByClassName()
//document.body.style.color="white";
//document.body.style.backgroundColor == "black";

//Declare The Value
function total_price(){
    var s1, s2, s3, total;	
    s1=parseFloat(document.order.sub1.value);
    s2=parseFloat(document.order.sub2.value);
    s3=parseFloat(document.order.sub3.value);
    total = s1 + s2 + s3;
   document.getElementById('totalAmount').value=total.toFixed(2);  } 
 