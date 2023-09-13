import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Dvr1FormComponent } from './dvr1-form.component';

describe('Dvr1FormComponent', () => {
  let component: Dvr1FormComponent;
  let fixture: ComponentFixture<Dvr1FormComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Dvr1FormComponent]
    });
    fixture = TestBed.createComponent(Dvr1FormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
