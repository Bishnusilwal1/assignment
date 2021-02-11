<!DOCTYPE html>
<head>
    <title> home </title>
    <link href="daraz.css" rel="stylesheet" type="text/css">
   
</head>
<body>
    
        <h2 class="title">Featured Products</h2>
        <div id="btn">
        <div id="row">
            <div class="col-1" style="border: 2px groove #5555;">
                <img src="t1.jpg" >
                <input type="button" class="btn" value="Add to Card">
                <h4>Yellow Ghost disgion printed casual cotton T-Shirt For Men</h4>
                <p>$50.00</p>

                   
                
            </div>
            
            <div class="col-1" style="border: 2px groove #5555;">
                <img src="t1.jpg">
                <span><input type="button" value="Add to Card"></span>
                <h4>Yellow Ghost disgion printed casual cotton T-Shirt For Men</h4>
                <p>$50.00</p>
                
                
            </div>
            <div class="col-1" style="border: 2px groove #5555;">
                <img src="t1.jpg">
                <span><input type="button" value="Add to Card"></span>
                <h4>Yellow Ghost disgion printed casual cotton T-Shirt For Men</h4>
                <p>$50.00</p>
            </div>
               
                
            
            <div class="col-1" style="border: 2px groove #5555;">
                <img src="t1.jpg">
                <span><input type="button" value="Add to Card"></span>
                <h4>Yellow Ghost disgion printed casual cotton T-Shirt For Men</h4>
                <p>$50.00</p>
            </div>

            
               
               
                
            
        </div>
        </div>      
    
</body>






    
       
    </html>
    *
{
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}
#row
{
    max-width: 1130px;
    margin: 5px;
    padding-left: 25px 20px; 
    padding-right: 25px;
    display: inline-flex;
    align-items: center;
    justify-content: space-between;
    float: left;
    left:5% ;
    position: relative;
}

 .col-1
 {
    flex-basis: 10%;
    padding: 5px 10px;
    min-width: 200px;
    margin-bottom: 50px;
    display: block;
    margin: 10px 10px;
    display: inline-block;
    

 }





   
    

.col-1 img
{
    width:100%;
}

  
 
.title
{
    text-align: center;
    margin: 0 auto 80px;
    position: relative;
    line-height: 60px;
    color:555;
}
.col-1 h4{
    color: #555;
    font-weight: normal;
}
.col-1 p{
    font-size: 14px;
}

