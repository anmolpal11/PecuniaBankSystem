import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FixeddepositsComponent } from './fixeddeposits.component';

describe('FixeddepositsComponent', () => {
  let component: FixeddepositsComponent;
  let fixture: ComponentFixture<FixeddepositsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FixeddepositsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FixeddepositsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
