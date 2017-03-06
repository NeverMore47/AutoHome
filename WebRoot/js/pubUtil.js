
PubUtil=function PubUtil(){};


PubUtil.showHideElement=function(id,isShow,doc)
{
  if(!doc)
    doc=document;
  var obj=doc.getElementById(id);
  if(!obj)
    return;
  if(isShow)
  {
    if(obj.style.display!=null) 
      obj.style.display = ""; //obj.style.display = "block"; 
    else 
      obj.visibility = "show"; 
  }
  else
  {
    if(obj.style.display!=null)
      obj.style.display = "none";
    else
      obj.visibility = "hiden";
  }
}
;



