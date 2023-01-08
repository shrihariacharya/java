import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Comp1Component } from './comp1/comp1.component';
import { Comp2Component } from './comp2/comp2.component';
import {FormsModule} from '@angular/forms';
import {BrowserModule} from '@angular/platform-browser';



@NgModule({
  declarations: [
    Comp1Component,
    Comp2Component
  ],

  imports: [
    CommonModule,
    BrowserModule,
    FormsModule,
    Module1Module
  ],

  exports: [
    Comp1Component,
    Comp2Component
  ]

  

})
export class Module1Module { }


