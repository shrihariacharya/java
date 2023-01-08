import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Interpoletion_Calculator';

  r1=0;
  add(n1:any, n2:any)
  {
    this.r1=parseInt(n1)+parseInt(n2);
    alert("sum is:"+this.r1);
  }

  r2=0;
  sub(n1:any, n2:any)
  {
    this.r2=parseInt(n1)-parseInt(n2);
    alert("Substraction is:"+this.r2);
  }

  r3=0;
  mul(n1:any, n2:any)
  {
    this.r3=parseInt(n1)*parseInt(n2);
    alert("Multiplication is:"+this.r3);
  }

  r4=0;
  div(n1:any, n2:any)
  {
    this.r4=parseInt(n1)/parseInt(n2);
    alert("Division is:"+this.r4);
  }


  
Student={
  Id:1,
  Name:"Shrihari",
  Contact:"1234567890"
}
}