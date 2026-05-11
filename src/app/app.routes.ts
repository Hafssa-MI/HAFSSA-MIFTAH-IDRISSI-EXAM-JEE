import { Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import {VehiculeComponent} from './vehicule/vehicule.component';

export const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'vehicule', component: VehiculeComponent },
  { path: '', redirectTo: 'login', pathMatch: 'full' },

];
