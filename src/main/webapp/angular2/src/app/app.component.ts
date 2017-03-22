import {Component, OnInit} from "@angular/core";
import {FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public submitted:boolean;

  user:FormGroup;

  ngOnInit() {
    this.user = new FormGroup({
      checkin: new FormControl(''),
      checkout: new FormControl('')
    });
  }

  onSubmit({value, valid}: { value:User, valid:boolean }) {
    console.log(value);
  }
}

export interface User {
  checkin:string;
  checkout:string;
}
