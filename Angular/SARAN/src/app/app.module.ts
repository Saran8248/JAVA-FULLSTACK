import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { Routes, RouterModule } from '@angular/router';
import { ChildComponent } from './child/child.component';
import { ChildService } from './child.service';
import {FormsModule } from '@angular/forms';

const ROUTES: Routes = [
 { path : 'home', component : HomeComponent},
 { path : 'contact', component : ContactComponent},
 { path : 'about', component : AboutComponent}
 ];
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ContactComponent,
    AboutComponent,
    ChildComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [ChildService],
  bootstrap: [AppComponent]
})
export class AppModule { }
