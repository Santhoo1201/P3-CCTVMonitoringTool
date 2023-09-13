import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginHrDetailsComponent } from './login-hr-details.component';

describe('LoginHrDetailsComponent', () => {
  let component: LoginHrDetailsComponent;
  let fixture: ComponentFixture<LoginHrDetailsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LoginHrDetailsComponent]
    });
    fixture = TestBed.createComponent(LoginHrDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
