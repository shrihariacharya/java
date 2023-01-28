import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { StudentModule } from './student/student.module';
import { BookModule } from './book/book.module';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatButtonModule} from '@angular/material/button';
import {MatMenuModule} from '@angular/material/menu';
import { MatIconModule} from '@angular/material/icon';
import {CdkMenuModule} from '@angular/cdk/menu';
import{MatFormFieldModule} from '@angular/material/form-field'
import { LiberaryserviceService } from './liberaryservice.service';
import { HttpClientModule } from '@angular/common/http';
import { MatTableModule } from '@angular/material/table';
import { MatIcon } from '@angular/material/icon';
import { MatSelect } from '@angular/material/select';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    StudentModule,
    BookModule,
    MatToolbarModule,
    MatButtonModule,
    MatMenuModule,
    MatIconModule,
    MatTableModule,
    CdkMenuModule,
    MatFormFieldModule,
    MatIcon ,
    MatSelect
    
  ],
  providers: [LiberaryserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
