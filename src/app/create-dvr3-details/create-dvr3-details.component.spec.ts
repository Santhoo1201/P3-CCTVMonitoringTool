import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateDvr3DetailsComponent } from './create-dvr3-details.component';

describe('CreateDvr3DetailsComponent', () => {
  let component: CreateDvr3DetailsComponent;
  let fixture: ComponentFixture<CreateDvr3DetailsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CreateDvr3DetailsComponent]
    });
    fixture = TestBed.createComponent(CreateDvr3DetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
