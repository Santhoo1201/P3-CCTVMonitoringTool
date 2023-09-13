import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Dvr3FromComponent } from './dvr3-from.component';

describe('Dvr3FromComponent', () => {
  let component: Dvr3FromComponent;
  let fixture: ComponentFixture<Dvr3FromComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Dvr3FromComponent]
    });
    fixture = TestBed.createComponent(Dvr3FromComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
