import {RouterModule} from '@angular/router';

import {HomeAdminComponent} from './component/admin/home-admin.component';

import {HomeComponent} from './component/home/home.component';
import {AboutComponent} from './component/home/about.component';
import {ContactComponent} from './component/home/contact.component';
import {SearchComponent} from './component/home/search/search.component';

import {ProfileComponent} from './component/user/profile/profile.component';

const appRoutes = [
  {path: '', component: HomeComponent},
  {path: 'index', component: HomeAdminComponent},
  {path: 'about', component: AboutComponent},
  {path: 'contact', component: ContactComponent},
  {path: 'profile', component: ProfileComponent},
  {path: 'search', component: SearchComponent}
];

export const routing = RouterModule.forRoot(appRoutes);
