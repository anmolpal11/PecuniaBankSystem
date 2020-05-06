import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SlipdebitComponent } from './slipdebit.component';

describe('SlipdebitComponent', () => {
  let component: SlipdebitComponent;
  let fixture: ComponentFixture<SlipdebitComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SlipdebitComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SlipdebitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
